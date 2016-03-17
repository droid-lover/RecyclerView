# RecyclerView

"RecyclerView is more advanced and flexible and efficient version of ListView.
RecyclerView ViewGroup is an container for larger data set of views that can be recycled and scrolled very efficiently.
RecyclerView can be used for larger datasets to be rendered on the UI like a list. RecyclerView provides maximum 
flexibility to design different kind of views."


i am explaining the working f a recycler view with card views here in this code thanks!

----------------------------------
Started Working With Recycler View 
----------------------------------

First of all create a new project in android studio 

-> go to app gradle file 

-> add the dependency for Recycler View    compile 'com.android.support:recyclerview-v7:23.0.1'  (Use latest one dependency at      the time you are creating your project) , and sync the project

-> in your activity/ fragment file use the Recycler View  with   <android.support.v7.widget.RecyclerView/> this tag  -- recyler 
  view is available in v7 widget support files 
  
-> go to you respective Java File and get a reference to this recycler view 

-> create a new layout (xml) file to create the custom view you want to infilate in your recyler view and named it like           custom_row.xml .
-> Create a Java class and name it RecyclerviewHolder and extend it with RecyclerView.ViewHolder  and create an  super            constructor , and then get access to all the views in your custom-row.xml file 

-> now create an another Java class named RecylerAdapter or MyRecyclerAdapter and extend it by RecyclerView.Adapter and pass your RecyclerviewHolder class here like 

                    class RecyclerAdapter extends RecyclerView.Adapter<RecyclerviewHolder>  

and then 
  create one constructor and  just press alt+enter 
  it will generate three methods for you , i.e. 
                                        you just need to override these three methods of RecyclerView.Adapter class 
                                                                   
  these three methods are :- 
  
     { onCreateViewHolder  , OnBindViewHolder  , getCount }
      
      OnCreateViewHolder  - a method where you will pass your custom view layout to infilate it with LayoutInflater and in this                         method only you need to create an Object of RecyclerviewHolder class also after that you will return                           this view object in this method .
      OnBindViewHolder    - you can perform any action here on your views just prefix holder. to all your views name and use                               them to perform any action or for any event handling
      
      getCount            - here we will return the value of count how many time you want to infilate your custom view 
      
->    now go to your respectve Activity or Fragment File and create one object of RecyclerAdapter Class and set this adapter on        your recycler view .

                            thats it !! 
                            
      AND WE CAN MAKE VIEW LIKE A LIST , LIKE A GRID , WITH THE HELP OF THIS SPECIAL VIEW CALLED RECYCLER VIEW :-) 
      
      just use LinearLayout or Staggered Layout or GridLayout in Activity 
      
      likethis  myRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    
      likethis myRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),int howManyColumnYouWantSize));
      
      
      likethis myRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, 1));
      

     
      likethis  myRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

      
         :-)  Happy Coding friends :-) 
