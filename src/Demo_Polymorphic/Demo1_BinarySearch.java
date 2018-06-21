package Demo_Polymorphic;

public class Demo1_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(BinarySearch(arr, 0, arr.length-1, 9));

        int[] arr2 = {1,2,3,4,5,6,7,9,10,11,12,22,33,45};

        System.out.println(BinarySearchWhile(arr2, 1));


    }

    private static int BinarySearch(int[] arr, int min, int max, int value){
        int mid = (min+max)/2;

        if (arr[mid] == value){
            return mid;
        }else{
            if (arr[mid] >value){
                return BinarySearch(arr, min, mid-1, value);
            }else{
                if (min>max){
                    return -1;
                }
                return BinarySearch(arr, mid+1, max, value);
            }
        }
    }

    private static int BinarySearchWhile(int[] arr, int value){
        int min = 0;
        int max = arr.length-1;
        int mid = (min+max)/2;

        while(arr[mid]!= value){
            if (arr[mid]> value){
                max = mid -1;
            }else{
                min = mid +1;
            }
            mid = (max+min) /2;
            if (min>max){
                return -1;
            }
        }
        return mid;

    }
}
