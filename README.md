# quanlycuahangdienthoai

public class slide5_2 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=EMPDB;user=sa;password=123456;encrypt=true;trustServerCertificate=true;";
        //kết nối với SQL 
        try {
            
            Connection con = DriverManager.getConnection(connectionUrl);     
            System.out.println("Connect success!!!");
            String SQL = "delete from employees where id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            
            preparedStatement.setInt(1,12);
            int row = preparedStatement.executeUpdate();
            System.out.println("row: "+ row);
            System.out.println("cap nhap thanh cong");
        }
        
        catch (SQLException e) {
            System.out.println("Connect error!!!");
            e.printStackTrace();
        }
    }
    
