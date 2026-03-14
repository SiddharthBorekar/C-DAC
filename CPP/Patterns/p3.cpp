// Write a program to generate a following @'s triangle:
//           @ @ @ @ @
//           @ @ @ @ 
//           @ @ @ 
//           @ @ 
//           @

# include <iostream>
using namespace std;
int main(){
    int n=4;
    // cout<<"Enter a nummber :";
    // cin>>n;
    for(int i=0;i<=n;i++){
        // for(int j=0;j<i;j++){
        //     cout<<" ";
        // }
        for(int j=4;j>=i;j--){
            cout<<"@";
        }
        cout<<endl;
    }
}