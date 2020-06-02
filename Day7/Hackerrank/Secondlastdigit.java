import java.io.*;
import java.util.*;
class UserMainCode
{
	public int Secondlastdigitof(int input1)
{
	if(input1>9)
	return (Math.abs((input1%100)/10));
	else if(input1<0)
	return(Math.abs((input1%100)/10));
	else
	return -1;
}
}