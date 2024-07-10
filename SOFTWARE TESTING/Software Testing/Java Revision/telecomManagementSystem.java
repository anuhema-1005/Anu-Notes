import java.util.*;
import java.sql.*;
class Main{
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        if(n == 1){
            int rno = Integer.parseInt(s.nextLine());
            String name = s.nextLine();
            String phn = s.nextLine();
            String pln = s.nextLine();
            String pay = s.nextLine();
            PreparedStatement ps = con.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?)");
            ps.setInt(1,rno);
            ps.setString(2,name);
            ps.setString(3,phn);
            ps.setString(4,pln);
            ps.setString(5,pay);
            ps.execute();
            System.out.println("Customer record inserted successfully.");
        }
        else if(n == 2){
            int rno = Integer.parseInt(s.nextLine());
            String name = s.nextLine();
            String phn = s.nextLine();
            String pln = s.nextLine();
            String pay = s.nextLine();
            PreparedStatement ps = con.prepareStatement("UPDATE customer SET name = ?,contact_information = ?,subscription_plan = ?,payment_history = ? WHERE customer_id = ?;");
            ps.setString(1,name);
            ps.setString(2,phn);
            ps.setString(3,pln);
            ps.setString(4,pay);
            ps.setInt(5,rno);
            ps.execute();
            System.out.println("Customer record updated successfully.");
        }
        else if(n > 3){
            System.out.println("Invalid operation number. Please try again.");
            return;
        }
        PreparedStatement selq = con.prepareStatement("Select * From customer");
        ResultSet rs = selq.executeQuery();
        while(rs.next()){
            System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Contact Information: " + rs.getString(3) + ", Subscription Plan: " + rs.getString(4) + ", Payment History: " + rs.getString(5));
        }
        con.close();
    }
}