import java.io.*;
import java.util.*;
class UserMainCode
{
	public int addlastdigitof(int input1,int input2)
{
	int r=0,r1=0,sum=0;
	r=input1%10;
	r1=input2%10;
	sum=r+r1;
	return sum;
}
}