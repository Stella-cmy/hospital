import java.util.Scanner;

public class SortedNums {
   public static void  mergeSX(int[] nums1,int nums1Len,int[] nums2)//两个数组顺序
    {
        int dst = nums1Len;
        int src = nums2.length;
        while (dst>0 && src > 0)
        {
            if (nums1[dst-1] <= nums2[src-1])
            {
                nums1[src+dst-1]=nums2[src-1];
                --src;
            }
            else
            {
                nums1[src+dst-1]=nums1[dst-1];
                --dst;
            }
        }
        while (dst==0&&src>0)
        {
            nums1[src-1]=nums2[src-1];
            --src;
        }
    }
    public static void  mergeDX(int[] nums1,int nums1Len,int[] nums2)//两个数组顺序
    {
        int dst = nums1Len;
        int src = nums2.length;
        while (dst>0 && src > 0)
        {
            if (nums1[dst-1] >= nums2[src-1])
            {
                nums1[src+dst-1]=nums2[src-1];
                --src;
            }
            else
            {
                nums1[src+dst-1]=nums1[dst-1];
                --dst;
            }
        }
        while (dst==0&&src>0)
        {
            nums1[src-1]=nums2[src-1];
            --src;
        }
    }
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String[] a = sca.nextLine().split(" ");
        String[] b = sca.nextLine().split(" ");
        int[] nums1 = new int[a.length+b.length];
        for(int i=0;i<a.length;i++) nums1[i] = Integer.parseInt(a[i]);
        int[] nums2 = new int[b.length];
        for(int i=0;i<b.length;i++) nums2[i] = Integer.parseInt(b[i]);
        int flag = 0;
        for(int i=0;i<a.length-1;i++)
        {
            if(nums1[i]>nums1[i+1]) //倒序
            {
                flag = 1; break;
            }
            if(nums1[i]>nums1[i+1]) //顺序
            {
                flag = 2; break;
            }
        }
        if(flag==0)
        {
            for(int i=0;i<b.length-1;i++)
            {
                if(nums2[i]>nums2[i+1]) //倒序
                {
                    flag = 1; break;
                }
                if(nums2[i]>nums2[i+1]) //顺序
                {
                    flag = 2; break;
                }
            }
        }
        if(flag == 1) SortedNums.mergeDX(nums1,a.length,nums2);//倒序合并
        else SortedNums.mergeSX(nums1,a.length,nums2);//顺序合并
        for(int i:nums1)
        System.out.print(i+" ");
    }
}
