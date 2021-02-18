package css.pizzzaorder;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//OrderAdapter class created that was extended for the Adapter parent class
public class OrderAdapter extends RecyclerView.Adapter<OrderViewHolder> {

        Application application;
        MainViewModel mainViewModel;
        //OrderAdapter constructor that takes in two parameters
        public OrderAdapter(Application application, MainViewModel mainViewModel){
            //Parameters saved locally in the mainViewModel
            this.application = application;
            this.mainViewModel = mainViewModel;
        }

    //Incorporate the three override adapter methods
        @NonNull
        @Override
        public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            // Create a new view, which defines the UI of the list item
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.order_row, parent, false);
            //return the new view for the specific order
            return new OrderViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
            //get the pizza position from the mainViewModel then connect it to a xml widget
            String selectedOrder = mainViewModel.getOrderItem(position);
            //Store returned selected order string in the text view(widget) holder
            holder.textViewOrder.setText(selectedOrder);
        }

        @Override
        public int getItemCount() {
            //Retrieve the number of items in the pizza order from the mainViewModel
            return mainViewModel.getOrderSize();

        }
}

