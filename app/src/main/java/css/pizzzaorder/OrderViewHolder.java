package css.pizzzaorder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.recyclerview.widget.RecyclerView;

//OrderViewHolder class created as an extension of the ViewHolder
public class OrderViewHolder extends RecyclerView.ViewHolder{
    //TextView widget variable initialized and connected to the XML file below
    TextView textViewOrder;
    //OrderViewHolder constructor
    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);

        textViewOrder = itemView.findViewById(R.id.textViewOrder);
    }
}
