package objectOrientedProgramming;

/**
     public class oopsCocept {
     String name;
     int code;
     int qty;
     void set(String name,int code,int qty)
     {
     this.name = name;
     this.code = code;
     this.qty = qty;
     }
     void sales(int unit)
     {
     if(this.qty>=unit)
     {
     this.qty=this.qty-unit;
     System.out.println(unit + "sold succesfully");
     return;
     }
     System.out.println("insufficient quantity");
     }
     void purchase(int unit)
     {
     this.qty=this.qty+unit;
     System.out.println(unit+"bought succesfully");
     }
     void check(){
     System.out.println("name:" + this.name);
     System.out.println("code:" + this.code);
     System.out.println("qty:" + this.qty);
     }

     public static void main(String[] args) {
     book b=new book();

     System.out.println(b);
     System.out.println(b.qty);
     System.out.println(b.name);
     System.out.println(b.code);
     b.set("effective java",123,100);
     b.check();
     b.sales(50);
     b.check();
     b.purchase(200);
     b.check();

     book b2;
     b2=new book();
     b2.set("c programming language",50,20);
     b2.sales(50);
     b2.purchase(500);
     b2.sales(100);
     b2.check;
     }
     }
*/