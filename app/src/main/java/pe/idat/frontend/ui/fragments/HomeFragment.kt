package pe.idat.frontend.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import pe.idat.frontend.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textViewWelcome: TextView = view.findViewById(R.id.textViewWelcome)
        val bottomNavigationView: BottomNavigationView = requireActivity().findViewById(R.id.nav_view)

        // Obtener los datos del usuario, membresía y gimnasio de los argumentos
        val userEmail = arguments?.getString("userEmail") ?: ""
        val membershipName = arguments?.getString("membershipName") ?: ""
        val membershipPrice = arguments?.getDouble("membershipPrice", 0.0) ?: 0.0
        val gymLocation = arguments?.getString("gymLocation") ?: ""

        // Mostrar los datos en la interfaz de usuario
        textViewWelcome.text = "Bienvenido, $userEmail\n"
        textViewWelcome.append("Membresía: $membershipName\n")
        textViewWelcome.append("Precio de la membresía: $membershipPrice\n")
        textViewWelcome.append("Ubicación del gimnasio: $gymLocation")

        // Hacer que el BottomNavigationView esté visible
        bottomNavigationView.visibility = View.VISIBLE
    }
}