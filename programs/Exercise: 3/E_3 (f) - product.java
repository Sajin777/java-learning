import java.util.Scanner;
class product
{
    private int productId;
    private String productName;
    private double price;
    private int stockQty;
    void ProductId(int productId)
    {
        this.productId = productId;
    }
    void ProductName(String productName)
    {
        this.productName = productName;
    }
    void Price(double price)
    {
        this.price = price;
    }
    void StockQuantity(int stockQuantity)
    {
        this.stockQty = stockQuantity;
    }
    int ProductId()
    {
        return productId;
    }
    String ProductName()
    {
        return productName;
    }
    double getPrice()
    {
        return price;
    }
    int StockQuantity()
    {
        return stockQty;
    }
    void purchase(int qty)
    {
        if(stockQty == 0)
        {
            System.out.println("Stock is null.");
        }
        else if(qty <= stockQty)
        {
            stockQty = stockQty - qty;
            System.out.println("Quantity Purchased : " +qty);
            System.out.println("Remaining Stock : " +stockQty);
        }
        else
        {
            System.out.println("Insufficient Stock.");
        }
    }
    void restock(int qty)
    {
        stockQty = stockQty + qty;
        System.out.println("Restocked Quantity : " +qty);
        System.out.println("Remaining Stock : " +stockQty);
    }
    void display()
    {
        System.out.println("-----Product Details-----");
        System.out.println("Product ID : " +productId);
        System.out.println("Product Name : " +productName);
        System.out.println("Price : " +price);
        System.out.println("Stock Quantity : " +stockQty);
    }
}
class pd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String choice;
        product p = new product();
        System.out.print("Enter Product ID: ");
        int pId = sc.nextInt();
        p.ProductId(pId);
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String pName = sc.nextLine();
        p.ProductName(pName);
        System.out.print("Enter Price: ");
        double pPrice = sc.nextDouble();
        p.Price(pPrice);
        System.out.print("Enter Stock Quantity: ");
        int pStock = sc.nextInt();
        p.StockQuantity(pStock);
        p.display();
        do
        {
            System.out.print("Enter operation [1.Purchase 2.Restock]: ");
            int op = sc.nextInt();
            if(op == 1)
            {
                System.out.print("Enter the Quantity to Purchase: ");
                int Qty = sc.nextInt();
                p.purchase(Qty);
            }
            else if(op == 2)
            {
                System.out.print("Enter Quantity to Restock: ");
                int restockQty = sc.nextInt();
                p.restock(restockQty);
            }
            else
            {
                System.out.println("Invalid Operation.");
            }
            System.out.print("Do you want to continue [Y/N]: ");
            sc.nextLine();
            choice = sc.nextLine();
        } while(choice.equals("Y")|| choice.equals("y"));
        p.display();
        sc.close();
    }
}