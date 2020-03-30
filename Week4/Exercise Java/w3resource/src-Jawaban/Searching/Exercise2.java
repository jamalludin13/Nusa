/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

/**
 *
 * @author Jamalludin
 */
public class Exercise2 {
    static int [] nums;

	public static void main(String[] args) {
		nums = new int[]{3,2,4,5,6,6,7,8,9,9,0,9};
		int result = Linear_Search(nums, 6);
		if(result == -1)
		{
			System.out.print("Not present in the array!");			
		}
		else
		System.out.println("Number found at index "+result);	
	}
	
	private static int Linear_Search(int [] nums,int search)
	{
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==search)
			{
				return i;
				
			}			
		}
		return -1;
		
	}
}

