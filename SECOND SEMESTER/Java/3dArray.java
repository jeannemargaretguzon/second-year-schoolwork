// JEANNE MARGARET L. GUZON
// BS Information Technology 2-5
// Object-Oriented Programming

package Java;

class Store{
    public static void main(String[] args){
        double[][][]ProductDetail = {
        // Table 1
        {
            {503302, 503303, 503304, 503305, 503309, 504401, 504402, 504403},
            {2.75, 1.25, 2.0f, 3.89, 9.0, 2.25, 4.3, 1.4}
        },
        // Table 2
        {
            {503305, 503302, 503305, 503303, 503304, 503303, 503309, 503303},
            {10, 22, 15, 5, 40, 10, 10, 12}
        },
        // Table 3
        {
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0}
        }
        };

        // Calculating the amount
        int rowcount = 8;
        for(int index = 0; index < rowcount; index++){
            float ProdCode = objProduct[0][index][0];
            float ProdPrice = objProduct[0][index][1];
            float ProdQty = ProdAmount = 0;

            for(int subindex = 0; subindex < rowcount; subindex++) {
                if(ProdCode == objProduct[1][subindex][0]){
                    ProdAmount = ProdQty > 0 ? ProdQty * ProdPrice;
                    objProduct[2][index][0] = ProdCode;
                    objProduct[2][index][1] = ProdAmount;
                }
        }

        for(int i = 0; i < ProductDetail.length; i++){
            if(i == 0){
                System.out.println("TABLE 1");
                System.out.println("PRODUCT CODE         PRICE");
                for(int j = 0; j < ProductDetail[i][i].length; j++){
                    System.out.println((int)ProductDetail[i][i][j] + "             " + ProductDetail[i][1][j]);
                }
            }
            
            else if(i == 1){
                System.out.println("\nTABLE 2");
                System.out.println("PRODUCT CODE         QUANTITY");
                for(int j = 0; j < ProductDetail[i][i].length; j++){
                    System.out.println((int)ProductDetail[i][0][j] + "             " + ProductDetail[i][i][j]);
                }
            } else if( i == 2){
                System.out.println("\nTABLE 3");
                System.out.println("PRODUCT CODE        AMOUNT");
                for(int j = 0; j < ProductDetail[i][0].length; j++){
                    System.out.println((int)ProductDetail[2][0][j] + "             " + ProductDetail[2][1][j]);
            }}}}
};

/*
    Table    |    Table 1    |     Table 2     |    Table 3
    503302          2.75f             22             
    503303          1.25f             27             
    503304          2.0f              40             
    503305          3.89f             25            
    503309          9.0f              10             
    504401          2.25f              0             
    504402          4.3f               0             
    504403          1.4f               0             
*/

