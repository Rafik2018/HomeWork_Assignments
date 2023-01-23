package Class11;

public class Task6_2D_Array_Countries {


    public static void main(String[] args) {


       /* Create 2D array of countries: north america countries, south america countries,
        europe countries, asian countries, african countries.Then print all values from that array using 2 different
        loops and calculate how many total countries been stored
        */






        String[][] countries = {
                {"North America", "USA", "Canada", "Mexico"},
                {"South America", "Brazil", "Argentina", "Colombia"},
                {"Europe", "France", "Germany", "Italy"},
                {"Asia", "China", "India", "Japan"},
                {"Africa", "Nigeria", "Egypt", "South Africa"}
        };
        int totalCountries = 0;

        // First loop
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i][0]);
            for (int j = 1; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);
                totalCountries++;
            }
            System.out.println("------------------");
        }

        System.out.println("Total number of countries: "+totalCountries);


/*


        // Second loop


        int i = 0;
        while(i < countries.length){
            System.out.println(countries[i][0]+" ");
            int j = 1;
            while (j < countries[i].length) {
                System.out.println(countries[i][j]);
                j++;
                totalCountries++;
            }
            i++;

       }
*/






















/*
        String[][] countries = {
                {"North America", "USA", "Canada", "Mexico"},
                {"South America", "Brazil", "Argentina", "Colombia"},
                {"Europe", "France", "Germany", "Italy"},
                {"Asia", "China", "India", "Japan"},
                {"Africa", "Nigeria", "Egypt", "South Africa"}
        };

        // Printing all countries and their continents
        for (int i = 0; i < countries.length; i++) {
            System.out.println(""  +      countries[i] [0]);
            for (int j = 1; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);


            }

        }
    }

}*//*
        String[][] countries = {
                {"North America", "USA", "Canada", "Mexico"},
                {"South America", "Brazil", "Argentina", "Colombia"},
                {"Europe", "France", "Germany", "Italy"},
                {"Asia", "China", "India", "Japan"},
                {"Africa", "Nigeria", "Egypt", "South Africa"}
        };

        // Printing all countries and their continents
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i][0]+" "); // printing the continent without the word continent
            for (int j = 1; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);
            }
            System.out.println("------------------"); // adding a blank line
        }
    }
}*/
        }
    }
