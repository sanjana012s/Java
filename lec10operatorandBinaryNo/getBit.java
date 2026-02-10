class getBit{
  public static void main(String args[]){
    int n=5;
    int pos=2;
    int bitmarks=1<<pos;
    if((bitmarks & n)==0){
      System.out.println("bitmash are zero");
    }
    else{
     System.out.println("bitmash are one"); 
    }
  }
}