class CFlag {
    public static void main(String[] args) {

        for(int i=1;i<=15;i++){
            for(int j=1;j<=45;j++){
                if ((i%2!=0&&i<=9)&&(j%2!=0&&j<=12))
                    System.out.print("*");
                if((i%2==0&&i<=9)&&(j%2==0&&j<=12))
                    System.out.print("*");
                if(i>9||j>12&&j<40)
                    System.out.print("=");

                else
                    System.out.print(" ");

            }
            System.out.println();
        }


    }
}
