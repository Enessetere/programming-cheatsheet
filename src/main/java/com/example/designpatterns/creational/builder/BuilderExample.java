package com.example.designpatterns.creational.builder;

public class BuilderExample {
    private String firstName;
    private String lastName;

    private BuilderExample() {

    }

    public static class Builder {
        private String firstName;
        private String lastName;

        public Builder() {
        }

        public Builder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public BuilderExample build() {
            final BuilderExample example = new BuilderExample();
            example.setFirstName(firstName);
            example.setLastName(lastName);
            return example;
        }
    }

    private void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
