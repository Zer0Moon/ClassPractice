
    package task1and2;

    /**
     *
     * @author INSERT YO NAME HERE DUMMY
     */
    public class Task1And2 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
           
            //Task 1 Ellipse Class

            //Printing using a random value using the Ellipse() constructor
            Ellipse e1 = new Ellipse();
            System.out.println("-------------------------------------");
            System.out.println("--------------Auto Run---------------");
            System.out.println("-------------------------------------");
            if (e1.isCircle() == true) {System.out.println("Is it a circle? Yes");}
            else {System.out.println("Is it a circle? No");}
            if (e1.isAxisValid() == true) {System.out.println("Is axis valid? Yes");}
            else {System.out.println("Is axis valid? No");}
            System.out.println(e1);


            //Printing using a random value using the Ellipse() constructor
            Ellipse e2 = new Ellipse(-10,10);
            System.out.println("-------------------------------------");
            System.out.println("Setting Major and Minor Axis manually");
            System.out.println("-------------------------------------");
            if (e2.isCircle() == true) {System.out.println("Is it a circle? Yes");}
            else {System.out.println("Is it a circle? No");}
            if (e2.isAxisValid() == true) {System.out.println("Is axis valid? Yes");}
            else {System.out.println("Is axis valid? No");}
            System.out.println(e2);
            System.out.println("-------------------------------------");


            //Printing using an object as a parameter
            Ellipse e3 = new Ellipse(e1);
            System.out.println("-------------------------------------");
            System.out.println("----Ellipse Object as a parameter----");
            System.out.println("-------------------------------------");
            if (e3.isCircle() == true) {System.out.println("Is it a circle? Yes");}
            else {System.out.println("Is it a circle? No");}
            if (e3.isAxisValid() == true) {System.out.println("Is axis valid? Yes");}
            else {System.out.println("Is axis valid? No");}
            System.out.println(e3);
            System.out.println("-------------------------------------");


            //Printing using an object as a parameter
            Ellipse e4 = new Ellipse();
            System.out.println("-------------------------------------");
            System.out.println("-Giving parameters by class fuctions-");
            System.out.println("-------------------------------------");
            if (e4.setMajorAxis(10) == true && e4.setMinorAxis(10) == true){
                if (e4.isCircle() == true) {System.out.println("Is it a circle? Yes");}
                else {System.out.println("Is it a circle? No");}
                if (e4.isAxisValid() == true) {System.out.println("Is axis valid? Yes");}
                else {System.out.println("Is axis valid? No");}
                System.out.println(e4);
            }
            System.out.println("*************************************");


            
            //Task 2
            
            Calendar c1 = new Calendar(2025,1,30); // year/month/day
            
            System.out.println(c1);
                       
            System.out.println(c1.getDaysInMonth());
            
            System.out.println(c1.isLeapYear());
            
            c1.increaseDays();
            
            c1.increaseMonth();
            
            c1.increaseYear();
            
            System.out.println(c1);
    }
    
}
