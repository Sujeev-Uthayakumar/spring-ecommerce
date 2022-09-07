import { ProductCategory } from './product-category';

describe('ProductCategory', () => {
  it('should create an instance', () => {
    expect(new ProductCategory(2, 'books')).toBeTruthy();
  });
});
