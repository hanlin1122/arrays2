class Main {
  public static int safeLength(int[] a){
    if(a == null){
      return a.length;
    }
    else{
      return -1;
    }
  }
  public static boolean equals(int[] a, int[] b){
    Boolean temp = false;
    if(a.length != b.length){
      return temp;
    }
    else{
      for(int i = 0; i < a.length; i++){
        if(a[i] == b[i]){
          temp = true;
        }
      }
    }
    return temp;
  }
  public static String equalityType(int[] a, int[] b){
    if(a == b){
      return "==";
    }
    else{
      return "not equal";
    }
  }
  public static int[] append(int[] a, int[] b){
    int len = a.length + b.length;
    int[] c = new arr[len];
    for(int i = 0; i < a.length; i++){
      c[i] += a[i];
    }
    for(int i = 0; i < b.length; i++){
      c[i+a.length] = b[i];
    }
    return c;
  }
  public static String arrayToString(int[] a){
    String str = "{";
    for(int i = 0; i < a.length; i++){
      if(i != a.length-1){
        str += (a[i] + ", ");
      }
      else{
        str += a[i];
      }
    }
    str += "}";
    return str;
  }
  public static int getIndex(int[] a, int index){
    if(index > 0){
      return a[index];
    }
    else{
      return a[a.length+index];
    }
  }
  public static int[] subArray(int[] a, int start, int end){
    int[] newA = new int[end-start];
    for(int i = start; i < end; i++){
      newA[i] =  a[i];
    }
    return newA;
  }
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
