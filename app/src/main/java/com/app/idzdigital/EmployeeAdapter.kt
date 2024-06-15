package com.app.idzdigital

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter (private val employees: List<Employee>) : RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>() {

    inner class EmployeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val nameTextViewage:TextView=itemView.findViewById(R.id.nameTextViewage)
        val nameTextViewSalary:TextView=itemView.findViewById(R.id.nameTextViewsalary)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_employee, parent, false)
        return EmployeeViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val employee = employees[position]
        holder.nameTextView.text = employee.name
        holder.nameTextViewage.text=employee.age
        holder.nameTextViewSalary.text=employee.salary

        holder.itemView.setOnClickListener {
            val context=holder.itemView.context
            val intent=Intent(context,MainActivity2::class.java)
            intent.putExtra("name",employee.name)
            intent.putExtra("age",employee.age)
            intent.putExtra("salary",employee.salary)
            context.startActivity(intent)
            Toast.makeText(holder.itemView.context, "Item number: ${position}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount() = employees.size
}