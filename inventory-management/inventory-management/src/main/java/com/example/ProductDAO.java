package com.example;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;
public class ProductDAO {
    public void saveProduct(Product product) {
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(product);
            tx.commit();
        }
    }
    public void updateProduct(Product product) {
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(product);
            tx.commit();
        }
    }
    public void deleteProduct(int id) {
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Product product = session.get(Product.class, id);
            if (product != null) {
                session.delete(product);
            }
            tx.commit();
        }
    }
    public List<Product> getAllProducts() {
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            return session.createQuery("from Product", Product.class).list();
        }
    }
    public Product getProductById(int id) {
        try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
            return session.get(Product.class, id);
        }
    }
}