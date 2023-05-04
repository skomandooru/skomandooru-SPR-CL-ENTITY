package Lab.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Spring uses Object Relational Mapping to provide an easy way to interact with the database. Most of the time,
 * database tables directly match model classes used in Java. Therefore, it is possible to dynamically generate
 * SQL statements based off of the contents of an Object. Object Relational Mapping will allow us to interact with
 * the database by directly retrieving and manipulating special Objects, now referred to as Entities, without the
 * need for writing SQL statements.
 *
 * In order to do that, this class will need to be marked as an Entity using the @Entity annotation. You will also
 * need to mark a field, such as productID, with the @Id annotation to establish the primary key of the database
 * table. All other fields of the class will automatically become columns of the database table.
 *
 * You can read Spring's own guide to Spring Data JPA & Entities here: https://spring.io/guides/gs/accessing-data-jpa/
 */
public class Product {
    private long productID;
    private String name;
    private String description;

    public Product(long productID, String name, String description) {
        this.productID = productID;
        this.name = name;
        this.description = description;
    }

    public Product(){

    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
