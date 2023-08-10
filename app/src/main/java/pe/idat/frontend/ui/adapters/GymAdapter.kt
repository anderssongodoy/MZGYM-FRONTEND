package pe.idat.frontend.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.idat.frontend.databinding.ItemGymBinding
import pe.idat.frontend.api.models.Gym
import pe.idat.frontend.api.models.Membership

class GymAdapter(
    var gyms: List<Gym>,
    private val onItemClickListener: (Gym) -> Unit
) : RecyclerView.Adapter<GymAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemGymBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val gym = gyms[position]
        holder.bind(gym)
    }

    override fun getItemCount(): Int = gyms.size

    inner class ViewHolder(private val binding: ItemGymBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(gym: Gym) {
            binding.apply {
                textViewGymName.text = gym.description
                textViewGymDescription.text = gym.direction
                // Handle other bindings as needed
                binding.root.setOnClickListener {
                    onItemClickListener.invoke(gym)
                }
            }
        }
    }
}