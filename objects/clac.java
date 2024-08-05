package objects;


// design structure

class Calculator{
  public int add(int nums1, int nums2){
    return nums1+nums2;
  }
}
public class clac {

  public static void main(String[] args) {
    
    int nums1 = 44;
    int nums2 = 46548;

    Calculator cal = new Calculator();

    int ans = cal.add(nums1, nums2);

    System.out.println(ans);

  }
  
}
