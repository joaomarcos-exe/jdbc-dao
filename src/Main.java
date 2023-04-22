import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);

        }


        list = sellerDao.findAll();
        for(Seller obj : list){
            System.out.println(obj);

        }
        System.out.println("TESTE4");
        Seller newSeller = new Seller(null, "Greg", "teste@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);;
        System.out.println(newSeller.getId());

        System.out.println("TESTE5");
       seller = sellerDao.findById(1);
       seller.setName("teste23");
       sellerDao.update(seller);

        System.out.println("TESTE6");
        sellerDao.deleteById(1);

    }
}