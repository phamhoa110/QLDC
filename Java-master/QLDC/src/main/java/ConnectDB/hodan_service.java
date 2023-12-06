/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.HoDan;
import model.User;

/**
 *
 * @author Admin
 */
public class hodan_service {
    Connection conn;
    public hodan_service() throws ClassNotFoundException{
        conn = ConnectJDBC.connect();
    }

    public ArrayList<HoDan> getAllHoDans(){
        ArrayList<HoDan> listHoDans = new ArrayList<>();
        String query = "SELECT * FROM hodan";

        Statement stm = null;
        try {
            //Tạo đối tượng Statement
            stm = conn.createStatement();

            //Thực thi truy vấn và trả về đối tượng ResultSet
            ResultSet rs = stm.executeQuery(query);

            //Duyệt kết quả trả về
            while (rs.next()){  //Di chuyển con trỏ xuống bản ghi kế tiếp
                int sonha = rs.getInt("sonha");
                int sothanhvien = rs.getInt("sothanhvien");

                listHoDans.add(new HoDan(sonha, sothanhvien));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listHoDans;

    }

    public void show(ArrayList<HoDan> list){
        list.forEach(i -> System.out.println(i));
    }

//    public User findUserById(ArrayList<User> list, int findId){
//       User fUser = null;
//       for(User u: list){
//           if(u.getId() == findId){
//               fUser = u;
//           }
//       }
//        return fUser;
//    }
//
    public void createhodanmoi(HoDan newhodan){
        String query = "INSERT INTO hodan(sonha, sothanhvien) " +
                "VALUES (null, ?)";

        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query);

            pstm.setInt(1, newhodan.getSoTV());
            
            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Thêm thành công " + row);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

//    public void updatePassword(User user, String newPassword){
//        String query = "UPDATE users SET password = ? WHERE id = ?";
//
//        PreparedStatement pstm = null;
//        try {
//            pstm = conn.prepareStatement(query);
//
//            pstm.setString(1, newPassword);
//            pstm.setInt(2, user.getId());
//
//            int row = pstm.executeUpdate();
//            if(row != 0){
//                System.out.println("Cập nhật thành công " + row);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
    public void deleteHoDan(HoDan hoDan){
        String query = "DELETE FROM hodan WHERE sonha = ?";

        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(query);

            pstm.setInt(1, hoDan.getSoNha());

            //Khi thực hiện các lệnh insert/update/delete sử dụng executeUpdate, nó sẽ trả về số hàng bị tác động
            int row = pstm.executeUpdate();
            if(row != 0){
                System.out.println("Xóa thành công " + row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
}
