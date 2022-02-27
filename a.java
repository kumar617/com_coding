IntNode temp = top;
int s=0;
while(temp!=null){
    if (temp.data <0)    s+=temp.data;
    temp=temp.link;
}
return s;

public static ArrayList<DataItem> removeAll(ArrayList<DataItem> base, Dataitem key ){
    ArrayList<DataItem> newBase = new ArrayList<DataItem>();
    Iterator itr = base.iterator();
    while (itr.hasNext())
    {
        //int x = (Integer)itr.next();
        if (itr.next()!=key)
            newBase.add(itr.next());
    }
    return newBase;
}

public static ArrayList<DataItem> removeAll(ArrayList<DataItem> base, Dataitem key ){
    ArrayList<DataItem> newBase = new ArrayList<DataItem>();
    int i=0;
    while (i<base.size())
    {
        if (base.get(i)!=key)
            newBase.add(base.get(i));
    }
    return newBase;
}


int [][] array=new int[3][5];
array[0][0]=1;
array[0][1]=0;
array[0][2]=0;

array[1][0]=0;
array[1][1]=5;

array[2][0]=0;
array[2][1]=0;
array[2][2]=0;
array[2][3]=0;
array[2][4]=1;
