package bootcamp.desafio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import bootcamp.desafio.domain.model.User;
import bootcamp.desafio.domain.model.repository.UserRepository;
import bootcamp.desafio.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository){
    this.userRepository = userRepository;
  }

  @Override
  public User findById(Long id) {
    User user = userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    return user;
  }

  @Override
  public User create(User userToCreate) {
    boolean isAccountNumber = userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())
    if (isAccountNumber) {
      throw new IllegalArgumentException("Account number already exists.");
  }
  return userRepository.save(userToCreate);
}
}
