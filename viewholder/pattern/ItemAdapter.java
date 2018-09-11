public class ItemAdapter extends BaseAdapter {

    private List<Item> items;

    public ItemAdapter(List<Item> items) {
        this.items = items;
    }

    class ViewHolder {

        private TextView textView;
        private ImageView imageView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        //check if received view has been inflated before
        if(convertView == null) {
            //get layout to inflate
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item, parent, false);
            viewHolder = viewHolder(convertView);

            //inflate views into viewHolder
            viewHolder.textView = convertView.findViewById(R.id.textView);
            viewHolder.imageView = convertView.findViewById(R.id.imageView);
            convertView.setTag(viewHolder);
        }
        else {
            //receive inflated view from memory
            viewHolder = (ViewHolder) convertView.getTag();
        }

        //set data into views
        Item item = items.get(position);
        viewHolder.textView.setText(item.getText());
        viewHolder.imageView.seImageResource(item.getImage());

        return convertView;
    }

    //here should be other adapter methods override from superclass
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Item getItem(int position) {
        return item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}