package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean isExtraCheese=false;
    private Boolean isTopping=false;
    private boolean wasTakeaway=false;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price=300;
            bill="Base Price Of The Pizza: 300\n";

        }
        else{
            price=400;
            bill="Base Price Of The Pizza: 400\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheese)
            return;

        price+=80;
        isExtraCheese=true;
        bill+="Extra Cheese Added: 80\n";

    }

    public void addExtraToppings(){
        // your code goes here
        if(isTopping)
            return;
        if(isVeg){
            price+=70;
            isTopping=true;
            bill+="Extra Toppings Added: 70\n";

        }
        else{
            price+=120;
            isTopping=true;
            bill+="Extra Toppings Added: 120\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(wasTakeaway){
            return;
        }
        price+=20;
        wasTakeaway=true;
        bill+="Paperbag Added: 20\n";
     }

    public String getBill(){
        // your code goes here
        bill+="Total Price: "+price;
        return this.bill;
    }
}
