package com.tdtpjava.td4.Exercice3;

public class main {
        public static void main(String[] args) {
            Point point = new Point(1 , 2 );
            Centre centre = new Centre(2 , 3 , "o");
            Cercle cercle = new Cercle(2 , 3 , "c" , 3);
            point.affCoord();
            centre.affCoord();
            centre.affNom();
            cercle.affNom();
        }
    }
