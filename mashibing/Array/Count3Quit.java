public class Count3Quit {
    public static void main(String[] args) {
        KidCircle kc = new KidCircle(500);
        int countNum = 0;
        Kid k = kc.first;
        while(kc.count > 1){
            countNum++;
            if(countNum == 3){
                countNum = 0;
                kc.delete(k);
            }
            k = k.right;
        }
        System.out.println(k.id);
    }
}
//孩子类
class Kid{
    int id;//以便知道在500个孩子中的位置
    Kid left,right;//每个孩子手拉手围成圈，因此其左右各有一个孩子
}
//孩子围成的圈
class KidCircle{
    int count = 0;//圈中有多少个孩子
    Kid first,last;//标记第一个孩子和最后一个孩子，第一个孩子的左边是最后一个孩子，最后一个孩子右边是第一个孩子
  //构造方法，接收一个参数，调用add方法来构成n大小的圈子
    KidCircle(int n){
        for(int i = 0;i < n;i++){
            add();
        }
    }
//往圈中添加孩子，并对其编号
    public void add(){
    //添加之前先创建孩子对象
        Kid k = new Kid();
        //将count数值赋值给id
        k.id = count;
        //当其中孩子节点为空时，上面生成的节点，自己和自己牵手形成圈
        if(count <= 0){
            first = k;
            last = k;
            k.left = k;
            k.right = k;
        }else{ //不为空时
            last.right = k;
            first.left = k;
            k.left = last;
            k.right = first;
            last = k;
        }
        //添加一个孩子后，count也+1;
        count++;
    }
    
    //删除一个孩子节点，进三退一
    public void delete(Kid k){
        if(count == 0){
        //没有孩子时，无法删除
            System.out.println("无法删除！");
            return;
        }else if(count == 1){
        //只有一个孩子时，自然将其置空，节点由垃圾回收器回收
                first = last = null;
                }else{
                //其他情况
                    k.right.left = k.left;
                    k.left.right = k.right;
                    if(k == first){
                        first = k.right;
                    }else if(k == last){
                        last = k.left;
                    }
                }
        //删去一个孩子节点，count-1;
        count--;
    }
}
