package org.example;

public class Homework303_2_1 {
    public static void main(String[] args) {
        color();
        divider();
        twoDoubler();
        xyVariables();
        viable();
        cafeShop();

    }
         // Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
        // Assign the sum to a variable. Print out the result. What variable type must the sum be?
        public static void color() {
            int blue = 1;
            double red = 9;

            double colors = blue + red;
            System.out.println(colors);
        }

        //Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
        // Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
        public static void divider() {
            int first = 100;
            int second = 50;
            double sum = (double) first / (double) second;
            System.out.println(sum);
        }

        //Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
        // Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
        public static void twoDoubler() {
            double first = 150;
            double second = 550;
            double sum = (double) second / (double) first;
            System.out.println(sum);

        }
        //Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
        // Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
        public static void xyVariables() {
            int x =11;
            int y = 20;
            int z = x + y;
            System.out.println(z);

        }
        //Write a program that declares a named constant and uses it in a calculation. Print the result.
        public static void viable() {
            int Seven = 7;
            int result = Seven + 11;
            System.out.println(result);
        }
        //Write a program where you create three variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product. Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product, four items of the second product, and two items of the third product.
        // Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.
        public static void cafeShop() {
            double subTotal;
            double totalSales;
            double Sales_Tax = 0.14;

            class Item {
                String name;
                Double price;

                public Item(String name, double price) {
                    this.name = name;
                    this.price = price;
                }
            }
                // Items
                Item coffee = new Item("Coffee", 7);
                Item IcedTea = new Item("IcedTea", 5);
                Item GreenTea = new Item("GreenTea", 4);

                subTotal =
                        coffee.price + IcedTea.price + GreenTea.price;
                totalSales = coffee.price + GreenTea.price + subTotal;
                System.out.println(totalSales);
                }
            }



