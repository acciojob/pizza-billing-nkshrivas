package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private int extraCheese;
    private int topping;
    private int paperbag;
    private String bill;
    private Boolean isExtraCheese=false;
    private Boolean isTopping=false;
    private Boolean wasTakeaway=false;
    private Boolean isBillGenerated=false;




    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price=300;
            topping = 70;
            bill="Base Price Of The Pizza: 300\n";

        }
        else{
            price=400;
            topping=120;
            bill="Base Price Of The Pizza: 400\n";
        }

        extraCheese=80;
        paperbag=20;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheese==false) {
            price += 80;
            isExtraCheese = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isTopping==false) {
            price += topping;
            isTopping = true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(wasTakeaway==false) {
            price += 20;
            wasTakeaway = true;
        }
     }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){
            if(isExtraCheese==true){
              bill = bill + "Extra Cheese Added: "+extraCheese+"\n";
            }
            if(isTopping==true){
                bill=bill + "Extra Toppings Added: "+topping+"\n";

            }
            if(wasTakeaway==true){
               bill = bill + "Paperbag Added: "+paperbag+"\n";
            }
            bill+="Total Price: "+price+"\n";

        }

        return this.bill;
    }
}
