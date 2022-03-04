class JavaPattern {
    public static void main(String[] args) {
        System.out.println();

        for(int i=1;i<=4;i++){
            for(int j=1;j<=28;j++){
                if ((i<=3&& j==4)||(i==3&&j==1)||(i==4&&j==2)||(i==4&&j==3))
                    System.out.print("J");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }


    }
}
