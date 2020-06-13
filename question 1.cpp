#include <iostream>
using namespace std;
int main()

{
	int arr[50];
	int size= 0, odd[50], even[50];
	int i,l=0,x=0, y=0;
	//size of the array
	cout<<"Enter the size of array: ";
	cin>> size;
	
	for(i= 0; i<size;i++){
		//the number
		cout<<"\nEnter the number["<<(i+1)<<"]: ";
		cin>> arr[i];
	}
	
	for(i= 0; i<size;i++)
	{
		if(arr[i]==9) 
		{
			break;
		}
		else if (arr[i]%2==0)
		{
			even[x]=arr[i];
			x++;
		}
		else
		{
			odd[y]=arr[i];
			y++;
		}
	}




		cout<<"\nThe even number: ";
		for(i=0; i<x; i++){
			cout<<even[i]<<" ";
		}
		
		cout<<"\nThe odd number: ";
		for(i=0; i<y; i++){
			cout<<odd[i]<<" ";
		}
		
		return 0;
}
