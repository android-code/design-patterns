public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private Context context;
    private List<Food> items;

    public FoodAdapter(Context context, List<Food> items) {
        this.context = context;
        this.items = items;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView nameView;
        private TextView priceView;
        private Button cartButton;

        ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.food_image);
            nameView = view.findViewById(R.id.food_name);
            priceView = view.findViewById(R.id.food_price);
            cartButton = view.findViewById(R.id.food_cart);
        }

        public void setData(Food item) {
            Picasso.with(context).load(item.getImageUrl()).into(imageView);
            nameView.setText(item.getName());
            priceView.setText(item.getPrice() + " PLN");
            cartButton.setOnClickListener(v -> addToCart(item));
        }
    }

    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item, parent, false);
        return new FoodAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        Food item = items.get(position);
        holder.setData(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    private void addToCart(Food item) {
        //add dish to cart action
    }
}