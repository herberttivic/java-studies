
package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDAO sellerDao = DAOFactory.createSellerDAO();

//        Department department = new Department(1, "nao importa nesse caso");
//        var date = new Date();
//        Seller sellerAbraao = new Seller(1, "Abraão","novoemail.s@gmail.com",1900, date, department);
//
//        System.out.println((sellerDao.findById(5)).toString());
//
//        sellerDao.insert(sellerAbraao);
//        List<Seller> list = sellerDao.listByDepartment(3);
//        for(Seller seller : list){
//            System.out.println(seller.toString());
//        }

//        sellerDao.update(sellerAbraao);

        List<Seller> list= sellerDao.list();
        list.forEach(seller ->{
            System.out.println(seller.toString());
        });
        DAOFactory.closeConnection();
    }
}
//+"(name, birthDate, email, \"baseSalary\", \"departmentId\")"

