package user;

public class UserServiceImpl implements UserService{
	
	private UserDto[] users;
	
	public UserServiceImpl() {
		users = new UserDto[3];
	}

	@Override
	public void join(UserDto user) {
		users[0] = user;
	}

	@Override
	public UserDto login(UserDto user) {
		UserDto result = null;
		if(user.getUserid().equals(users[0].getUserid()) &&
				user.getPassword().equals(users[0].getPassword())) {
			result = users[0];
		}else {
			result = null;
		}
		
		return result;
	}

	@Override
	public void update(UserDto user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserDto user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean idCheck(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDto mypage(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto[] userList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto idSearch(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto[] nameSearch(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
