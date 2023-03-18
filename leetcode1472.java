class BrowserHistory {
    int step;
    List<String> urls;
    
    public BrowserHistory(String homepage) {
        step = 0;
        urls = new ArrayList<>();
        urls.add(homepage);
    }
    
    public void visit(String url) {
        urls = urls.subList(0, step+1);
        step++;
        urls.add(url);
    }
    
    public String back(int steps) {
        if (step - steps < 0) {
            step = 0;
        } else {
            step -= steps;
        }
        return urls.get(step);
        
    }
    
    public String forward(int steps) {
        if (step + steps >= urls.size()) {
            step = urls.size()-1;
        } else {
            step += steps;
        }
        
        return urls.get(step);
    }
}
