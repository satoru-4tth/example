
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
	A. } catch (NumberFormatException | Exception e) {}
	A. } catch (NumberFormatException e | Exception e) {}
	A. } catch (RuntimeException e | ClassNotFoundException e) {}
	A. } catch (NumberFormatException | ClassNotFoundException e) {}
	*/