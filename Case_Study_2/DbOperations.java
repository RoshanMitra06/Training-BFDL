import java.util.Scanner;
import java.sql.*;
import java.util.ArrayList;

public class DbOperations {
  static Scanner sc = new Scanner(System.in);

  public static void main(String args[]) throws SQLException {
    System.out.println("********Welcome to Bookstore********");
    System.out.println("What you want to do");
    System.out.println("1. Enter record");
    System.out.println("2. Check all books");
    System.out.println("3. Update cost of a book");
    System.out.println("4. Remove a book");
    System.out.println("5. Repeat");
    int n = sc.nextInt();
    //create();
    switch (n) {
      case 1:
        System.out.println("Enter book name");
        String bn = sc.next();
        System.out.println("Enter author name");
        String aut = sc.next();
        System.out.println("Enter cost");
        int c = sc.nextInt();
        System.out.println("Enter id");
        int id = sc.nextInt();
        Book book = new Book(id, bn, aut, c);
        insert(book);
        break;
      case 2:
        display();
        break;
      case 3:
        update();
        break;
      case 4:
        System.out.println("Enter id");
        int i = sc.nextInt();
        remove(i);
        break;

    }

  }

  public static java.sql.Connection connection;

  public static void getConnection() throws SQLException {

    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_books", "root", "roshan06");
  }

  public static void create() throws SQLException {
    getConnection();

    Statement statement = connection.createStatement();
    String name = "data";
    boolean res = statement.execute("CREATE TABLE " + name + "(id INT PRIMARY KEY,book_name VARCHAR(30),"
        + "author_name VARCHAR(30), cost INT)");

    if (res) {
      System.out.println("Table " + name + " has been created successfully");
    } else
      System.out.println("Table " + name + " is not created");

    connection.close();
  }

  public static void insert(Book book) throws SQLException {
    getConnection();

    PreparedStatement statement = connection.prepareStatement("INSERT INTO data(id,book_name,author_name,cost)"
        + "VALUES (?,?,?,?)");

    // manual mapping. This is where ORM frameworks stands out.
    statement.setInt(1, book.getId());
    statement.setString(2, book.getBook_name());
    statement.setString(3, book.getAuthor_name());
    statement.setInt(4, book.getCost());

    int rows_affected = statement.executeUpdate();

    if (rows_affected > 0) {
      System.out.println(rows_affected + " rows are affected");
    } else
      System.out.println("Sorry unable to insert");

    connection.close();
  }

  public static void display() throws SQLException {
    getConnection();

    Statement statement = connection.createStatement();

    ResultSet rs = statement.executeQuery("select * from data");

    ArrayList<Book> list = new ArrayList<>();
    while (rs.next()) {
      int id = rs.getInt(1);
      String book_name = rs.getString(2);
      String author_name = rs.getString(3);
      int cost = rs.getInt(4);

      Book b = new Book(id, book_name, author_name, cost);
      list.add(b);

    }

    for (Book b : list) {
      System.out.println(b.getId()+" " +b.getBook_name()+" "+b.getAuthor_name()+" "+b.getCost());
    }
    connection.close();
  }

  public static void update() throws SQLException {
    getConnection();

    Statement statement = connection.createStatement();
    System.out.println("Enter the id");
    int id = sc.nextInt();
    System.out.println("Enter the new amount");
    int amt = sc.nextInt();
    boolean rs = statement.execute("UPDATE data SET cost=" + amt + " where id=" + id);
    if(rs){
      System.out.println("Updated the cost");
    }
    else{
      System.out.println("Can't update the cost");
    }
    connection.close();
  }

  public static void remove(int id) throws SQLException {
    getConnection();

    Statement statement = connection.createStatement();
    boolean rs = statement.execute("DELETE FROM data where id=" + id);
    connection.close();
  }
}
