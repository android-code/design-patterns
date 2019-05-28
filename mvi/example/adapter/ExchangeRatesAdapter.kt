class ExchangeRatesAdapter : RecyclerView.Adapter<ExchangeRatesAdapter.ViewHolder>() {

    private val items = mutableListOf<ExchangeRate>()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name : TextView = view.item_name
        val price : TextView = view.item_price
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.name.text = item.currency
        holder.price.text = item.price.toString()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun addItems(newItems : List<ExchangeRate>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }
}