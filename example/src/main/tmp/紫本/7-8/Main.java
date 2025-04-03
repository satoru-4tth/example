
public class Main {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt("a");
			x();
		/* insert code here */
		}
		public static void x() throws ClassNotFoundException {
			throw new ClassNotFoundException();
		}
}

	
	/*
	A. } catch (Exception e) {}
	B. } catch (NumberFormatException | Exception e) {}
	C. } catch (NumberFormatException e | Exception e) {}
	D. } catch (RuntimeException e | ClassNotFoundException e) {}
	E. } catch (NumberFormatException | ClassNotFoundException e) {}
	*/