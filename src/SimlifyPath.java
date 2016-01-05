import java.util.Stack;

/**
 * 
 * @author chenqun
 * Given an absolute path for a file (Unix-style), simplify it.
 * For example,path = "/home/", => "/home",path = "/a/./b/../../c/", => "/c"
 */
public class SimlifyPath {
	
	public String simplyfypath(String path){
		String ans = "";
		Stack<String> stack = new Stack<String>();
		//去除path中重复的/
		String newpath = "";
		for(int i=1; i<path.length(); i++){
			if(path.charAt(i) == path.charAt(i-1) && path.charAt(i-1) == '/')
				continue;
			else
				newpath += path.charAt(i);
		}
		String[] cat = newpath.split("/");
		for(int i=0; i<cat.length; i++){
			if(cat[i].equals("..")){
				if(!stack.isEmpty())
					stack.pop();
				else
					//return "/";
					continue;
			}else if(cat[i].equals("."))
				continue;
			else {
				stack.push(cat[i]);
			}
		}
		if(stack.isEmpty()) return "/";
		while(!stack.isEmpty()){
			ans = '/' + stack.pop() + ans;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimlifyPath test = new SimlifyPath();
		String path = "/a/./b///../c/../././../d/..//../e/./f/./g/././//.//h///././/..///";
		System.out.println("ans " + test.simplyfypath(path));
	}

}
