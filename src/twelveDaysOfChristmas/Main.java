package twelveDaysOfChristmas;

/*
* Write the smallest program that outputs the lyrics of the Xmas carol The Twelve Days of Xmas.
You must reproduce the words in the correct order, but case, format, and punctuation are left to your discretion.

The lyrics are as follows:

On the first day of Christmas
My true love gave to me:
A partridge in a pear tree.

On the second day of Christmas
My true love gave to me:
Two turtle doves and
A partridge in a pear tree.

On the third day of Christmas
My true love gave to me:
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the forth day of Christmas
My true love gave to me:
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the fifth day of Christmas
My true love gave to me:
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the sixth day of Christmas,
My true love gave to me:
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the seventh day of Christmas,
My true love gave to me:
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the eight day of Christmas,
My true love gave to me:
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the ninth day of Christmas,
My true love gave to me:
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the tenth day of Christmas,
My true love gave to me:
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the eleventh day of Christmas,
My true love gave to me:
Eleven pipers piping
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the Twelfth day of Christmas,
My true love gave to me:
Twelve drummers drumming
Eleven pipers piping
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves
And a partridge in a pear tree.

[Source https://rosettacode.org]
* */


public class Main {

    public static void main(String[] args) {
        String[][] carols;
        carols = new String[][] {
                {"first", "a partridge in a pear tree"},
                {"second", "Two turtle doves"},
                {"third", "Three french hens"},
                {"fourth", "Four calling birds"},
                {"fifth", "Five golden rings"},
                {"sixth", "Six geese a-laying"},
                {"seventh", "Seven swans a-swimming"},
                {"eighth", "Eight maids a-milking"},
                {"ninth", "Nine ladies dancing"},
                {"tenth", "Ten lords a-leaping"},
                {"eleventh", "Eleven pipers piping"},
                {"twelfth", "Twelve drummers drumming"}
        };


        //sing
        for(int i = 0; i < carols.length; i++){

            String gifts = null;

            System.out.println("On the " + carols[i][0] + " day of Christmas");
            System.out.println("My true love gave to me: ");
            if(i == 0 ){
                gifts = carols[i][1];
            } else {
                gifts = carols[i][1] + "\n" + gifts;
            }
            System.out.println(gifts);

            System.out.println();
        }
        

    }


}
