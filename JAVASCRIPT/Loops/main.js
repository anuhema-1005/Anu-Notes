/*// Loops
// while loop
let i=1;
while(i<=50)
{
    console.log(i);
    i=i+1;
}
// do while loop
let i=50;
do
{
    console.log(i);
    i++;
}while(i<50);
// for loop
let name="jvndsoudh";
for(i=0;i<name.length;i++)
{
    console.log(name.charAt(i));
}*/
let name="jvndsoudh";
for(i=0;i<name.length;i++)
{
    for(j=0;j<name.length;j++)
    {
        console.log(i,j);
    }
}
// break and continue