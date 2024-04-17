
package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
//        Department department = new Department(1, "Documentos");
//        var date = new Date();
//        Seller seller = new Seller(1, "Herbert","herbertduarte.santos@gmail.com",1900, date, department);
//        System.out.println(seller.toString());

        SellerDAO sellerDao = DAOFactory.createSellerDAO();

        System.out.println((sellerDao.findById(5)).toString());
    }
}
//+"(name, birthDate, email, \"baseSalary\", \"departmentId\")"

