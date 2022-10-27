public class Exercise {
  public static void main(String[] args) throws Exception {
  
  
  
    int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};
    
  
    // PATTERN 1

    int total_1 = 0; 
      for (int rows = 0; rows < mdArray.length; rows++) {
        for (int columns = 0; columns < mdArray.length; columns++) {
          if (rows == 0) {
            total_1 += mdArray[rows][columns];
          }
          else {
            break;
          }
        }
      }
      System.out.println("1. SUM OF PATTERN 1: " + total_1);


    // PATTERN 2
    int total_2 = 0;
      for (int rows = 0; rows < mdArray.length; rows++) {
        for (int column = 0; column < mdArray.length; column++) {
          if (column == 0) {
            total_2 += mdArray[rows][column];
        }
      }
    }
    System.out.println("");
    System.out.println("2. SUM OF PATTERN 2: " + total_2);

        
    // PATTERN 3
    int total_3 = 0;
    for (int rows = 0; rows < mdArray.length; rows++) {
      for (int column = 0; column < mdArray.length; column++) {
        if (rows == 0 || column == 0) {
          total_3 += mdArray[rows][column];
        }
      }
    }
    System.out.println("");
    System.out.println("3. SUM OF PATTERN 3: " + total_3);

        
    // PATTERN 4
    int total_4 = 0;
    for (int rows = 0; rows < mdArray.length; rows++) {
      for (int column = 0; column < mdArray.length; column++) {
        if ((rows == 0 && column == 0) || (rows == 0 && column == 3) || (rows == 3 && column == 0) || (rows == 3 && column == 3))  {
          total_4 += mdArray[rows][column];
        }
      }
    }
    System.out.println("");
    System.out.println("4. SUM OF PATTERN 4: " + total_4);
        

    // PATTERN 5
    int total_5 = 0;
    for (int rows = 0; rows < mdArray.length; rows++) {
      for (int column = 0; column < mdArray.length; column++) {
        if ((rows == 1 && column == 1) || (rows == 2 && column == 1) || (rows == 1 && column == 2) || (rows == 2 && column == 2))  {
          total_5 += mdArray[rows][column];
      }
    }
  }
    System.out.println("");
    System.out.println("5. SUM OF PATTERN 5: " + total_5);
      
    
    // PATTERN 6
    int total_6 = 0;
    for (int rows = 0; rows < mdArray.length; rows++) {
      for (int column = 0; column < mdArray.length; column++) {
        if ((rows == 0 && column == 0) || (rows == 0 && column == 3) || (rows == 3 && column == 0) || (rows == 3 && column == 3))  {
          total_6 += mdArray[rows][column];
        }
        if ((rows == 1 && column == 1) || (rows == 2 && column == 1) || (rows == 1 && column == 2) || (rows == 2 && column == 2)) {
          total_6 += mdArray[rows][column];
        }
      }
    }
    System.out.println("");
    System.out.println("6. SUM OF PATTERN 6: " + total_6);

   }
  }
