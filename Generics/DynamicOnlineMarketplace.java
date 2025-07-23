package level_1;
abstract class ProductCategory {
    private String categoryName;
    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getCategoryName() {
        return categoryName;
    }
}

class BookCategory extends ProductCategory {
    public BookCategory() {
        super("Books");
    }
}

class ClothingCategory extends ProductCategory {
    public ClothingCategory() {
        super("Clothing");
    }
}

class GadgetCategory extends ProductCategory {
    public GadgetCategory() {
        super("Gadgets");
    }
}

class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public T getCategory() {
        return category;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

public class DynamicOnlineMarketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100.0);
        product.setPrice(product.getPrice() - discount);
    }
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 500.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Cotton Shirt", 800.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 15000.0, new GadgetCategory());
        applyDiscount(book, 10);
        applyDiscount(shirt, 15);
        applyDiscount(phone, 5);
        System.out.println(book.getName() + " - " + book.getCategory().getCategoryName() + ": ₹" + book.getPrice());
        System.out.println(shirt.getName() + " - " + shirt.getCategory().getCategoryName() + ": ₹" + shirt.getPrice());
        System.out.println(phone.getName() + " - " + phone.getCategory().getCategoryName() + ": ₹" + phone.getPrice());
    }
}
