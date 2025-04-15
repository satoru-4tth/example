public class TroubleMaker implements AutoCloseable {
	@Override
	public void close() throws Exception {
		throw new RuntimeException("trouble");
	}
}


public class TroubleMaker {
	public static void main(String[] args) {
		try (TroubleResource a = new TroubleResource()) {
			throw new Exception();
		} catch (RuntimeException e) {
			System.out.println("A");
		} catch (Exception e) {
			System.out.println("B");
		}
	}
}